.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\r2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\r2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00100#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010%\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Ltb/a;",
        "_connection",
        "La0/g;",
        "",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
        "_map",
        "Ll83/a0;",
        "__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity",
        "(Ltb/a;La0/g;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
        "channelConfigInnerEntity",
        "insertConfig",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "channelConfigInnerEntities",
        "insertConfigs",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "commands",
        "insertCommands",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;",
        "channelConfigEntity",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;",
        "selectAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "deleteCommands",
        "deleteConfigs",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfChannelConfigInnerEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__insertAdapterOfCommandInnerEntity",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfChannelConfigInnerEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfCommandInnerEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__insertAdapterOfChannelConfigInnerEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__insertAdapterOfCommandInnerEntity:Landroidx/room/k;

    return-void
.end method

.method private final __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(Ltb/a;La0/g;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "La0/g;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, La0/c;

    iget-object v1, v0, La0/c;->w:La0/g;

    invoke-virtual {v1}, La0/f1;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget v2, p2, La0/f1;->y:I

    const/16 v3, 0x3e7

    if-le v2, v3, :cond_1

    new-instance v0, Lh02/h;

    const/16 v1, 0x16

    invoke-direct {v0, v1, p0, p1}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, v0}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v2, "SELECT `name`,`description`,`args`,`set`,`channelType`,`id` FROM `command_inner_entity` WHERE `channelType` IN ("

    invoke-static {v2}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v1, v1, La0/f1;->y:I

    invoke-static {v1, v2}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    invoke-virtual {v0}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    move-object v3, v0

    check-cast v3, La0/m;

    invoke-virtual {v3}, La0/m;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, La0/m;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/2addr v2, v1

    goto :goto_0

    :cond_2
    :try_start_0
    const-string v0, "channelType"

    invoke-static {p1, v0}, Ljc/x;->M(Ltb/c;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_3

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    const/4 v3, 0x4

    invoke-interface {p1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;->setId(I)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p2
.end method

.method private static final __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity$lambda$6(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;La0/g;)Ll83/a0;
    .locals 1

    const-string v0, "_tmpMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(Ltb/a;La0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->insertConfig$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final access$insert$s-21986483(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_channel_config LIMIT 100"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->selectAll$lambda$3(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic c(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM command_inner_entity"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->deleteCommands$lambda$4(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->insertConfigs$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final deleteCommands$lambda$4(Ljava/lang/String;Ltb/a;)Ll83/a0;
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

.method private static final deleteConfigs$lambda$5(Ljava/lang/String;Ltb/a;)Ll83/a0;
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

.method public static synthetic e(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->insertCommands$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_channel_config"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->deleteConfigs$lambda$5(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;La0/g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity$lambda$6(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;La0/g;)Ll83/a0;

    return-void
.end method

.method private static final insertCommands$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__insertAdapterOfCommandInnerEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertConfig$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__insertAdapterOfChannelConfigInnerEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertConfigs$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__insertAdapterOfChannelConfigInnerEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final selectAll$lambda$3(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 53

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v3, "channelType"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "createdAt"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "updatedAt"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "name"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "isTypingEvents"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "isReadEvents"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "deliveryEventsEnabled"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "isConnectEvents"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "isSearch"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "isReactionsEnabled"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "isThreadEnabled"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "isMutes"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "uploadsEnabled"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "urlEnrichmentEnabled"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "customEventsEnabled"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "pushNotificationsEnabled"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "messageRetention"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "maxMessageLength"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "automod"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "automodBehavior"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "blocklistBehavior"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "messageRemindersEnabled"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "markMessagesPending"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    new-instance v15, La0/g;

    move/from16 v26, v14

    const/4 v14, 0x0

    invoke-direct {v15, v14}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v27

    if-eqz v27, :cond_1

    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v28

    if-nez v28, :cond_0

    move/from16 v28, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v14, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v13, v28

    :cond_0
    const/4 v14, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1b

    :cond_1
    move/from16 v28, v13

    invoke-interface {v2}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    :goto_2
    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v14, v13}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v31

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_3

    const/4 v14, 0x0

    goto :goto_3

    :cond_3
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    :goto_3
    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v13, v14}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v32

    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v33

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    if-eqz v13, :cond_4

    const/16 v34, 0x1

    :goto_4
    move-object v13, v15

    goto :goto_5

    :cond_4
    const/16 v34, 0x0

    goto :goto_4

    :goto_5
    invoke-interface {v2, v8}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_5

    const/16 v35, 0x1

    goto :goto_6

    :cond_5
    const/16 v35, 0x0

    :goto_6
    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_6

    const/16 v36, 0x1

    goto :goto_7

    :cond_6
    const/16 v36, 0x0

    :goto_7
    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_7

    const/16 v37, 0x1

    goto :goto_8

    :cond_7
    const/16 v37, 0x0

    :goto_8
    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_8

    const/16 v38, 0x1

    goto :goto_9

    :cond_8
    const/16 v38, 0x0

    :goto_9
    invoke-interface {v2, v12}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_9

    const/16 v39, 0x1

    :goto_a
    move v15, v4

    move/from16 v14, v28

    move/from16 v28, v5

    goto :goto_b

    :cond_9
    const/16 v39, 0x0

    goto :goto_a

    :goto_b
    invoke-interface {v2, v14}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_a

    const/16 v40, 0x1

    :goto_c
    move/from16 v4, v26

    move/from16 v26, v6

    goto :goto_d

    :cond_a
    const/16 v40, 0x0

    goto :goto_c

    :goto_d
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_b

    const/16 v41, 0x1

    :goto_e
    move/from16 v5, p0

    move/from16 p0, v7

    goto :goto_f

    :cond_b
    const/16 v41, 0x0

    goto :goto_e

    :goto_f
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_c

    const/16 v42, 0x1

    :goto_10
    move v7, v4

    move/from16 v6, v16

    move/from16 v16, v5

    goto :goto_11

    :cond_c
    const/16 v42, 0x0

    goto :goto_10

    :goto_11
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_d

    const/16 v43, 0x1

    :goto_12
    move/from16 v4, v17

    move/from16 v17, v6

    goto :goto_13

    :cond_d
    const/16 v43, 0x0

    goto :goto_12

    :goto_13
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_e

    const/16 v44, 0x1

    :goto_14
    move/from16 v5, v18

    move/from16 v18, v7

    goto :goto_15

    :cond_e
    const/16 v44, 0x0

    goto :goto_14

    :goto_15
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_f

    const/16 v45, 0x1

    :goto_16
    move/from16 v6, v19

    goto :goto_17

    :cond_f
    const/16 v45, 0x0

    goto :goto_16

    :goto_17
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move/from16 v19, v4

    move/from16 v7, v20

    move/from16 v20, v5

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v5, v21

    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v48

    move/from16 v0, v22

    invoke-interface {v2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v49

    move/from16 v22, v0

    move/from16 v0, v23

    invoke-interface {v2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v50

    move/from16 v23, v0

    move/from16 v47, v4

    move/from16 v21, v5

    move/from16 v0, v24

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_10

    const/16 v51, 0x1

    :goto_18
    move/from16 v24, v6

    move/from16 v4, v25

    goto :goto_19

    :cond_10
    const/16 v51, 0x0

    goto :goto_18

    :goto_19
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_11

    const/16 v52, 0x1

    goto :goto_1a

    :cond_11
    const/16 v52, 0x0

    :goto_1a
    new-instance v29, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    invoke-direct/range {v29 .. v52}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    move-object/from16 v5, v29

    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v13}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v25, v0

    const-string v0, "getValue(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    invoke-direct {v0, v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    move/from16 v6, v26

    move/from16 v5, v28

    move/from16 v28, v14

    move/from16 v26, v18

    move/from16 v18, v20

    move/from16 v20, v7

    move/from16 v7, p0

    move/from16 p0, v16

    move/from16 v16, v17

    move/from16 v17, v19

    move/from16 v19, v24

    move/from16 v24, v25

    move/from16 v25, v4

    move v4, v15

    move-object v15, v13

    goto/16 :goto_1

    :cond_12
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_1b
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public final deleteCommands(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x9

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

.method public final deleteConfigs(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x8

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

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$insert$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$insert$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertCommands(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertConfig(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x17

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

.method public final insertConfigs(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ljava/util/List;I)V

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

.method public final selectAll(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lhb2/c;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    invoke-static {v0, v2, v2, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
