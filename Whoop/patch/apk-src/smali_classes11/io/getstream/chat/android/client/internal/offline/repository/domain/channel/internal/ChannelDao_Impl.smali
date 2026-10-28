.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J&\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J$\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u000eJ\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ \u0010 \u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008 \u0010!J(\u0010%\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008%\u0010&J \u0010%\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008%\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008(\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010D\u00a8\u0006F"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
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
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfChannelEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "__listConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "__mapConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "__syncStatusConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;",
        "__setConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;",
        "__memberConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;",
        "__locationConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfChannelEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

.field private final __locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

.field private final __mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

.field private final __memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

.field private final __setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

.field private final __syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__insertAdapterOfChannelEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT cid FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->selectCidsBySyncNeeded$lambda$3(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static final synthetic access$get__locationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    return-object p0
.end method

.method public static final synthetic access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__memberConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    return-object p0
.end method

.method public static final synthetic access$get__setConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    return-object p0
.end method

.method public static final synthetic access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->select$lambda$7(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->selectSyncNeeded$lambda$5(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic d(ZLio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)V
    .locals 6

    const-string v0, "UPDATE stream_chat_channel_state SET hidden = ?, hideMessagesBefore = ? WHERE cid = ?"

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->setHidden$lambda$12(Ljava/lang/String;ZLio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final delete$lambda$10(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final deleteAll$lambda$14(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method public static synthetic e(Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT cid FROM stream_chat_channel_state"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->selectAllCids$lambda$2(Ljava/lang/String;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->insertMany$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic g(Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE from stream_chat_channel_state WHERE cid = ?"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->delete$lambda$10(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN (?)"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->select$lambda$9(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__insertAdapterOfChannelEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertMany$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__insertAdapterOfChannelEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "UPDATE stream_chat_channel_state SET deletedAt = ? WHERE cid = ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->setDeletedAt$lambda$11(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic k(Ljava/lang/String;Ltb/a;Z)V
    .locals 1

    const-string v0, "UPDATE stream_chat_channel_state SET hidden = ? WHERE cid = ?"

    invoke-static {v0, p2, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->setHidden$lambda$13(Ljava/lang/String;ZLjava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_channel_state"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->deleteAll$lambda$14(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final select$lambda$7(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 61

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v1, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_22

    :cond_0
    const-string v2, "type"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v4, "channelId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "cooldown"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdByUserId"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "filterTags"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "frozen"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "hidden"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "hideMessagesBefore"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "members"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "memberCount"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "watcherIds"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v3, "watcherCount"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "reads"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "lastMessageAt"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v16, v3

    const-string v3, "lastMessageId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "createdAt"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "updatedAt"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "deletedAt"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "extraData"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "syncStatus"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "team"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "ownCapabilities"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "membership"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "activeLiveLocations"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "messageCount"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "cid"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v29

    if-eqz v29, :cond_1a

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v31

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v32

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v33

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    move/from16 v29, v4

    move/from16 v58, v5

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v5

    const/16 v30, 0x0

    if-eqz v5, :cond_1

    move-object/from16 v5, v30

    :goto_2
    move/from16 v59, v2

    goto :goto_3

    :cond_1
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v37
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v37, :cond_19

    move/from16 v35, v4

    :try_start_1
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_2

    const/16 v38, 0x1

    goto :goto_4

    :cond_2
    const/16 v38, 0x0

    :goto_4
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v6

    move-object/from16 v5, v30

    goto :goto_5

    :cond_3
    move v4, v6

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_5
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_6

    :cond_4
    const/4 v5, 0x0

    :goto_6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v39, v5

    goto :goto_7

    :cond_5
    move-object/from16 v39, v30

    :goto_7
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object/from16 v5, v30

    goto :goto_8

    :cond_6
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :goto_8
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v40

    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object/from16 v5, v30

    goto :goto_9

    :cond_7
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_9
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMemberMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v41

    if-eqz v41, :cond_18

    invoke-interface {v1, v14}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v30

    :goto_a
    move/from16 v60, v4

    goto :goto_b

    :cond_8
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :goto_b
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v43

    if-eqz v43, :cond_17

    move/from16 v4, p1

    move/from16 v42, v5

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v2, v5

    move/from16 v5, p3

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v30

    :goto_c
    move/from16 v44, v2

    goto :goto_d

    :cond_9
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_c

    :goto_d
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToReadMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v45

    if-eqz v45, :cond_16

    move/from16 v2, v16

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v30

    :goto_e
    move/from16 v16, v2

    goto :goto_f

    :cond_a
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v46

    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_e

    :goto_f
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v46

    move/from16 v2, v17

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v47, v30

    :goto_10
    move/from16 v6, v18

    goto :goto_11

    :cond_b
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v47, v6

    goto :goto_10

    :goto_11
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 v18, v2

    move-object/from16 v2, v30

    :goto_12
    move/from16 p1, v4

    goto :goto_13

    :cond_c
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move/from16 v18, v2

    move-object/from16 v2, v17

    goto :goto_12

    :goto_13
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v48

    move/from16 v2, v19

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v4, v30

    :goto_14
    move/from16 v19, v2

    goto :goto_15

    :cond_d
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v49

    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_14

    :goto_15
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v49

    move/from16 v2, v20

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v30

    :goto_16
    move/from16 v20, v2

    goto :goto_17

    :cond_e
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v50

    invoke-static/range {v50 .. v51}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_16

    :goto_17
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v50

    move/from16 v2, v21

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_f

    move-object/from16 v4, v30

    :goto_18
    move/from16 v21, v2

    goto :goto_19

    :cond_f
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_18

    :goto_19
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v51

    if-eqz v51, :cond_15

    move/from16 p3, v5

    move/from16 v2, v22

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v52

    move/from16 v4, v23

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v53

    move/from16 v5, v24

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_10

    move/from16 v22, v2

    move-object/from16 v2, v30

    :goto_1a
    move/from16 v23, v4

    goto :goto_1b

    :cond_10
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v22, v2

    move-object/from16 v2, v17

    goto :goto_1a

    :goto_1b
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;->stringToSortedSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v54

    move/from16 v2, v25

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_11

    move-object/from16 v4, v30

    :goto_1c
    move/from16 v25, v2

    goto :goto_1d

    :cond_11
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :goto_1d
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;->stringToMemberMap(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v55

    move/from16 v2, v26

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v4, v30

    :goto_1e
    move/from16 v26, v2

    goto :goto_1f

    :cond_12
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1e

    :goto_1f
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocationList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v56

    if-eqz v56, :cond_14

    move/from16 v2, v27

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_13

    move/from16 v24, v5

    :goto_20
    move-object/from16 v57, v30

    goto :goto_21

    :cond_13
    move/from16 v24, v5

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    goto :goto_20

    :goto_21
    new-instance v30, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-direct/range {v30 .. v57}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V

    move-object/from16 v4, v30

    move/from16 v5, v28

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->setCid(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    move/from16 v27, v2

    move/from16 v28, v5

    move/from16 v17, v18

    move/from16 v4, v29

    move/from16 v5, v58

    move/from16 v2, v59

    move/from16 v18, v6

    move/from16 v6, v60

    goto/16 :goto_1

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_22
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final select$lambda$9(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
    .locals 58

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "_connection"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v2, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    const/4 v3, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v2, v3}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_16

    :cond_0
    invoke-interface {v2, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const-string v0, "type"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v4, "channelId"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "cooldown"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdByUserId"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "filterTags"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "frozen"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "hidden"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "hideMessagesBefore"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "members"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "memberCount"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "watcherIds"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v3, "watcherCount"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "reads"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "lastMessageAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v16, v3

    const-string v3, "lastMessageId"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "createdAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "updatedAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "deletedAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "extraData"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "syncStatus"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "team"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "ownCapabilities"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "membership"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "activeLiveLocations"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "messageCount"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "cid"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v28

    const/16 v29, 0x0

    if-eqz v28, :cond_1a

    invoke-interface {v2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v31

    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v32

    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v33

    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v0, v4

    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    invoke-interface {v2, v9}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v4, v29

    goto :goto_1

    :cond_1
    invoke-interface {v2, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v37
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v37, :cond_19

    :try_start_1
    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    const/16 v38, 0x1

    goto :goto_2

    :cond_2
    move/from16 v38, v6

    :goto_2
    invoke-interface {v2, v11}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object/from16 v5, v29

    goto :goto_3

    :cond_3
    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_3
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-eqz v5, :cond_4

    const/4 v6, 0x1

    :cond_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v39, v5

    goto :goto_4

    :cond_5
    move-object/from16 v39, v29

    :goto_4
    invoke-interface {v2, v12}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object/from16 v5, v29

    goto :goto_5

    :cond_6
    invoke-interface {v2, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :goto_5
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v40

    invoke-interface {v2, v13}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object/from16 v5, v29

    goto :goto_6

    :cond_7
    invoke-interface {v2, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMemberMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v41

    if-eqz v41, :cond_18

    invoke-interface {v2, v14}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v2, v15}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v29

    goto :goto_7

    :cond_8
    invoke-interface {v2, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_7
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v43

    if-eqz v43, :cond_17

    move/from16 v6, p1

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v4, v6

    move/from16 v6, p3

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_9

    move-object/from16 v6, v29

    goto :goto_8

    :cond_9
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_8
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToReadMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v45

    if-eqz v45, :cond_16

    move/from16 v6, v16

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object/from16 v6, v29

    goto :goto_9

    :cond_a
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_9
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v46

    move/from16 v6, v17

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v47, v29

    :goto_a
    move/from16 v6, v18

    goto :goto_b

    :cond_b
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v47, v6

    goto :goto_a

    :goto_b
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v6, v29

    goto :goto_c

    :cond_c
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_c
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v48

    move/from16 v6, v19

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v6, v29

    goto :goto_d

    :cond_d
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_d
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v49

    move/from16 v6, v20

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_e

    move-object/from16 v6, v29

    goto :goto_e

    :cond_e
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_e
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v50

    move/from16 v6, v21

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_f

    move-object/from16 v6, v29

    goto :goto_f

    :cond_f
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_f
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v51

    if-eqz v51, :cond_15

    move/from16 v6, v22

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v52

    move/from16 v6, v23

    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v53

    move/from16 v6, v24

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_10

    move-object/from16 v6, v29

    goto :goto_10

    :cond_10
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_10
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;->stringToSortedSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v54

    move/from16 v6, v25

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_11

    move-object/from16 v6, v29

    goto :goto_11

    :cond_11
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_11
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;->stringToMemberMap(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v55

    move/from16 v6, v26

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_12

    move-object/from16 v6, v29

    goto :goto_12

    :cond_12
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_12
    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v1, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocationList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v56

    if-eqz v56, :cond_14

    move/from16 v1, v27

    invoke-interface {v2, v1}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_13

    :goto_13
    move-object/from16 v57, v29

    goto :goto_14

    :cond_13
    invoke-interface {v2, v1}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    goto :goto_13

    :goto_14
    new-instance v30, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move/from16 v35, v0

    move/from16 v44, v4

    move/from16 v42, v5

    invoke-direct/range {v30 .. v57}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V

    move-object/from16 v0, v30

    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->setCid(Ljava/lang/String;)V

    move-object/from16 v29, v0

    goto :goto_15

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1a
    :goto_15
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v29

    :goto_16
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectAllCids$lambda$2(Ljava/lang/String;Ltb/a;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final selectCidsBySyncNeeded$lambda$3(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result p1

    int-to-long p1, p1

    const/4 p4, 0x1

    invoke-interface {p0, p4, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p1, 0x2

    int-to-long p2, p3

    invoke-interface {p0, p1, p2, p3}, Ltb/c;->p(IJ)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p0, p2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final selectSyncNeeded$lambda$5(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 60

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result v2

    int-to-long v2, v2

    const/4 v4, 0x1

    invoke-interface {v1, v4, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v2, 0x2

    move/from16 v3, p3

    int-to-long v5, v3

    invoke-interface {v1, v2, v5, v6}, Ltb/c;->p(IJ)V

    const-string v2, "type"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "channelId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "cooldown"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdByUserId"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "filterTags"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "frozen"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "hidden"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "hideMessagesBefore"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "members"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "memberCount"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "watcherIds"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "watcherCount"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p2, v4

    const-string v4, "reads"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p3, v4

    const-string v4, "lastMessageAt"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p4, v4

    const-string v4, "lastMessageId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v16, v4

    const-string v4, "createdAt"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v17, v4

    const-string v4, "updatedAt"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v18, v4

    const-string v4, "deletedAt"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v19, v4

    const-string v4, "extraData"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v20, v4

    const-string v4, "syncStatus"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v21, v4

    const-string v4, "team"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v22, v4

    const-string v4, "ownCapabilities"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v23, v4

    const-string v4, "membership"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v24, v4

    const-string v4, "activeLiveLocations"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v25, v4

    const-string v4, "messageCount"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v26, v4

    const-string v4, "cid"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v27, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v28

    if-eqz v28, :cond_19

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v31

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v32

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v33

    move/from16 v28, v2

    move/from16 v57, v3

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v35

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    const/16 v29, 0x0

    if-eqz v3, :cond_0

    move-object/from16 v3, v29

    :goto_1
    move/from16 v34, v2

    goto :goto_2

    :cond_0
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :goto_2
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v36
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v36, :cond_18

    move v3, v5

    move/from16 v58, v6

    :try_start_1
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_1

    const/16 v37, 0x1

    goto :goto_3

    :cond_1
    const/16 v37, 0x0

    :goto_3
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v7

    move-object/from16 v6, v29

    goto :goto_4

    :cond_2
    move v5, v7

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_4
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-eqz v6, :cond_3

    const/4 v6, 0x1

    goto :goto_5

    :cond_3
    const/4 v6, 0x0

    :goto_5
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    move-object/from16 v38, v6

    goto :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_20

    :cond_4
    move-object/from16 v38, v29

    :goto_6
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v29

    goto :goto_7

    :cond_5
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_7
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v39

    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v29

    goto :goto_8

    :cond_6
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_8
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMemberMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v40

    if-eqz v40, :cond_17

    invoke-interface {v1, v14}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object/from16 v7, v29

    :goto_9
    move/from16 v59, v3

    goto :goto_a

    :cond_7
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_9

    :goto_a
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v42

    if-eqz v42, :cond_16

    move/from16 v3, p2

    move/from16 p2, v5

    move/from16 v41, v6

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v2, v5

    move/from16 v5, p3

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v29

    goto :goto_b

    :cond_8
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_b
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToReadMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v44

    if-eqz v44, :cond_15

    move/from16 v6, p4

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_9

    move-object/from16 v7, v29

    :goto_c
    move/from16 v43, v2

    goto :goto_d

    :cond_9
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v45

    invoke-static/range {v45 .. v46}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_c

    :goto_d
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v45

    move/from16 v2, v16

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object/from16 v46, v29

    :goto_e
    move/from16 v7, v17

    goto :goto_f

    :cond_a
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v46, v7

    goto :goto_e

    :goto_f
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_b

    move/from16 v17, v2

    move-object/from16 v2, v29

    :goto_10
    move/from16 v16, v3

    goto :goto_11

    :cond_b
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    move/from16 v17, v2

    move-object/from16 v2, v16

    goto :goto_10

    :goto_11
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v47

    move/from16 v2, v18

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object/from16 v3, v29

    :goto_12
    move/from16 v18, v2

    goto :goto_13

    :cond_c
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v48

    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_12

    :goto_13
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v48

    move/from16 v2, v19

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_d

    move-object/from16 v3, v29

    :goto_14
    move/from16 v19, v2

    goto :goto_15

    :cond_d
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v49

    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_14

    :goto_15
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v49

    move/from16 v2, v20

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_e

    move-object/from16 v3, v29

    :goto_16
    move/from16 v20, v2

    goto :goto_17

    :cond_e
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_16

    :goto_17
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v50

    if-eqz v50, :cond_14

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 v2, v21

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v51

    move/from16 v3, v22

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v52

    move/from16 v5, v23

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v29

    :goto_18
    move/from16 v21, v2

    goto :goto_19

    :cond_f
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_18

    :goto_19
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__setConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;->stringToSortedSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v53

    move/from16 v2, v24

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_10

    move-object/from16 v6, v29

    :goto_1a
    move/from16 v24, v2

    goto :goto_1b

    :cond_10
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1a

    :goto_1b
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__memberConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;->stringToMemberMap(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v54

    move/from16 v2, v25

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_11

    move-object/from16 v6, v29

    :goto_1c
    move/from16 v25, v2

    goto :goto_1d

    :cond_11
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1c

    :goto_1d
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocationList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v55

    if-eqz v55, :cond_13

    move/from16 v2, v26

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_12

    move/from16 v23, v5

    :goto_1e
    move-object/from16 v56, v29

    goto :goto_1f

    :cond_12
    move/from16 v23, v5

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    goto :goto_1e

    :goto_1f
    new-instance v29, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-direct/range {v29 .. v56}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V

    move-object/from16 v5, v29

    move/from16 v6, v27

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->setCid(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v7

    move/from16 v7, p2

    move/from16 p2, v16

    move/from16 v16, v17

    move/from16 v17, v0

    move-object/from16 v0, p1

    move/from16 v26, v2

    move/from16 v22, v3

    move/from16 v27, v6

    move/from16 v2, v28

    move/from16 v3, v57

    move/from16 v6, v58

    move/from16 v5, v59

    goto/16 :goto_0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_19
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final setDeletedAt$lambda$11(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    invoke-interface {p0, p2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, p2, v0, v1}, Ltb/c;->p(IJ)V

    :goto_0
    const/4 p1, 0x2

    invoke-interface {p0, p1, p3}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final setHidden$lambda$12(Ljava/lang/String;ZLio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    int-to-long v0, p1

    const/4 p1, 0x1

    :try_start_0
    invoke-interface {p0, p1, v0, v1}, Ltb/c;->p(IJ)V

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x2

    if-nez p1, :cond_0

    invoke-interface {p0, p2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, p2, v0, v1}, Ltb/c;->p(IJ)V

    :goto_0
    const/4 p1, 0x3

    invoke-interface {p0, p1, p4}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final setHidden$lambda$13(Ljava/lang/String;ZLjava/lang/String;Ltb/a;)Ll83/a0;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    int-to-long v0, p1

    const/4 p1, 0x1

    :try_start_0
    invoke-interface {p0, p1, v0, v1}, Ltb/c;->p(IJ)V

    const/4 p1, 0x2

    invoke-interface {p0, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method


# virtual methods
.method public final delete(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lht2/d;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x15

    invoke-direct {v1, v2, p0, p1}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMany(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x13

    invoke-direct {v1, v2, p0, p1}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    .line 11
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x14

    invoke-direct {v1, v2, p1, p0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    .line 1
    const-string v0, "SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN ("

    .line 2
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 4
    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    .line 5
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lig0/h;

    const/4 v3, 0x7

    invoke-direct {v2, v0, p1, p0, v3}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectAllCids(Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/4 v2, 0x1

    invoke-static {v0, v2, v2, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectCidsBySyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectSyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lig0/h;

    const/16 v2, 0x8

    invoke-direct {v1, p0, p2, p1, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHidden(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lch0/e;

    const/16 v6, 0x9

    move-object v3, p0

    move-object v5, p1

    move v2, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lch0/e;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHidden(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 3
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

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Las1/f;

    const/4 v2, 0x4

    invoke-direct {v1, p2, p1, v2}, Las1/f;-><init>(ZLjava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
