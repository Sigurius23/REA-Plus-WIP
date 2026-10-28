.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ$\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J&\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J&\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J*\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0004\u0008 \u0010!J(\u0010$\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010(R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u0006058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "reactionEntity",
        "Ll83/a0;",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;",
        "delete",
        "",
        "id",
        "selectReactionById",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "selectReactionsByIds",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "limit",
        "selectIdsSyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;",
        "selectSyncStatus",
        "",
        "reactionType",
        "messageId",
        "userId",
        "selectUserReactionToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectUserReactionsToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ljava/util/Date;",
        "deletedAt",
        "setDeleteAt",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfReactionEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "__syncStatusConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "Landroidx/room/i;",
        "__deleteAdapterOfReactionEntity",
        "Landroidx/room/i;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __deleteAdapterOfReactionEntity:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfReactionEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__insertAdapterOfReactionEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__deleteAdapterOfReactionEntity:Landroidx/room/i;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->delete$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ltb/a;)V
    .locals 6

    const-string v0, "UPDATE stream_chat_reaction SET deletedAt = ? WHERE userId = ? AND messageId = ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->setDeleteAt$lambda$8(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_reaction"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->deleteAll$lambda$9(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT id FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectIdsSyncStatus$lambda$4(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final delete$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__deleteAdapterOfReactionEntity:Landroidx/room/i;

    invoke-virtual {p0, p2, p1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final deleteAll$lambda$9(Ljava/lang/String;Ltb/a;)Ll83/a0;
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

.method public static synthetic e(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectReactionsByIds$lambda$3(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic g(ILio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_reaction WHERE id = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectReactionById$lambda$2(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 6

    const-string v0, "SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.type = ? AND stream_chat_reaction.messageid = ? AND userId = ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectUserReactionToMessage$lambda$6(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.messageid = ? AND userId = ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectUserReactionsToMessage$lambda$7(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__insertAdapterOfReactionEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->selectSyncStatus$lambda$5(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final selectIdsSyncStatus$lambda$4(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

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

    invoke-interface {p0, p2}, Ltb/c;->getLong(I)J

    move-result-wide p2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

.method private static final selectReactionById$lambda$2(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 32

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    move/from16 v2, p1

    int-to-long v2, v2

    const/4 v4, 0x1

    :try_start_0
    invoke-interface {v1, v4, v2, v3}, Ltb/c;->p(IJ)V

    const-string v2, "messageId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "userId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v5, "type"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "createdAt"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdLocallyAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deletedAt"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "enforceUnique"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "skipPush"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "emojiCode"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "extraData"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "syncStatus"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "id"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    const/16 v17, 0x0

    if-eqz v16, :cond_9

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v3, v17

    goto :goto_0

    :cond_0
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_0
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v3, v17

    goto :goto_1

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_1
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v3, v17

    goto :goto_2

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_2
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v3, v17

    goto :goto_3

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_3
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v26

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    const/16 v27, 0x1

    goto :goto_4

    :cond_4
    move/from16 v27, v5

    :goto_4
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v3, v6

    if-eqz v3, :cond_5

    const/16 v28, 0x1

    goto :goto_5

    :cond_5
    move/from16 v28, v5

    :goto_5
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v29, v17

    goto :goto_6

    :cond_6
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v29, v3

    :goto_6
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_7
    move-object/from16 v3, v17

    goto :goto_8

    :cond_7
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v30

    if-eqz v30, :cond_8

    invoke-interface {v1, v15}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v31

    new-instance v18, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move/from16 v22, v2

    invoke-direct/range {v18 .. v31}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    move-object/from16 v0, v18

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    move-object/from16 v17, v0

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v17

    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectReactionsByIds$lambda$3(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 32

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

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    int-to-long v5, v5

    invoke-interface {v1, v4, v5, v6}, Ltb/c;->p(IJ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    const-string v2, "messageId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v4, "userId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "type"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "createdAt"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdLocallyAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deletedAt"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "enforceUnique"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "skipPush"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "emojiCode"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "extraData"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "syncStatus"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move/from16 p3, v4

    move/from16 v16, v5

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v5

    const/16 v17, 0x0

    if-eqz v5, :cond_1

    move-object/from16 v5, v17

    :goto_2
    move/from16 v31, v2

    goto :goto_3

    :cond_1
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v22

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v2, v17

    goto :goto_4

    :cond_2
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_4
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, v17

    goto :goto_5

    :cond_3
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_5
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v2, v17

    goto :goto_6

    :cond_4
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_6
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    move/from16 v21, v4

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v2, v4

    if-eqz v2, :cond_5

    const/16 v26, 0x1

    goto :goto_7

    :cond_5
    const/16 v26, 0x0

    :goto_7
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_6

    const/16 v27, 0x1

    goto :goto_8

    :cond_6
    const/16 v27, 0x0

    :goto_8
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v28, v17

    goto :goto_9

    :cond_7
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v2

    :goto_9
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    :goto_a
    move-object/from16 v2, v17

    goto :goto_b

    :cond_8
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    goto :goto_a

    :goto_b
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v29

    if-eqz v29, :cond_9

    invoke-interface {v1, v15}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v30

    new-instance v17, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-direct/range {v17 .. v30}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    move-object/from16 v2, v17

    move/from16 v4, p1

    move/from16 p1, v6

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v6, p1

    move/from16 p1, v4

    move/from16 v5, v16

    move/from16 v2, v31

    move/from16 v4, p3

    goto/16 :goto_1

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectSyncStatus$lambda$5(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

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

    const-string v2, "messageId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "userId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v5, "type"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "createdAt"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdLocallyAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deletedAt"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "enforceUnique"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "skipPush"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "emojiCode"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "extraData"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "syncStatus"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "id"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p2, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move/from16 p3, v2

    move/from16 p4, v3

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    const/16 v16, 0x0

    if-eqz v3, :cond_0

    move-object/from16 v3, v16

    :goto_1
    move/from16 v21, v2

    goto :goto_2

    :cond_0
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_1

    :goto_2
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v22

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v2, v16

    goto :goto_3

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_3
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v2, v16

    goto :goto_4

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_4
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, v16

    goto :goto_5

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_5
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_4

    const/16 v26, 0x1

    :goto_6
    move-object v2, v4

    goto :goto_7

    :cond_4
    const/16 v26, 0x0

    goto :goto_6

    :goto_7
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_5

    const/16 v27, 0x1

    goto :goto_8

    :cond_5
    const/16 v27, 0x0

    :goto_8
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v28, v16

    goto :goto_9

    :cond_6
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v28, v3

    :goto_9
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_a
    move-object/from16 v3, v16

    goto :goto_b

    :cond_7
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    goto :goto_a

    :goto_b
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v29

    if-eqz v29, :cond_8

    invoke-interface {v1, v15}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v30

    new-instance v17, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-direct/range {v17 .. v30}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    move-object/from16 v3, v17

    move/from16 v4, p2

    move/from16 p2, v5

    move/from16 v16, v6

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v3, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v5, p2

    move/from16 v3, p4

    move/from16 p2, v4

    move/from16 v6, v16

    move-object v4, v2

    move/from16 v2, p3

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_c

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    move-object v2, v4

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectUserReactionToMessage$lambda$6(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 32

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v3, 0x2

    move-object/from16 v4, p2

    invoke-interface {v1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v3, 0x3

    move-object/from16 v4, p3

    invoke-interface {v1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "messageId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "userId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "type"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "createdAt"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdLocallyAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deletedAt"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "enforceUnique"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "skipPush"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "emojiCode"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "extraData"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "syncStatus"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    const/16 v17, 0x0

    if-eqz v16, :cond_9

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object/from16 v4, v17

    goto :goto_0

    :cond_0
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_0
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v4, v17

    goto :goto_1

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_1
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v4, v17

    goto :goto_2

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_2
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v4, v17

    goto :goto_3

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_3
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v26

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    const/16 v27, 0x1

    goto :goto_4

    :cond_4
    move/from16 v27, v5

    :goto_4
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v4, v6

    if-eqz v4, :cond_5

    const/16 v28, 0x1

    goto :goto_5

    :cond_5
    move/from16 v28, v5

    :goto_5
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object/from16 v29, v17

    goto :goto_6

    :cond_6
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v29, v4

    :goto_6
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_7
    move-object/from16 v4, v17

    goto :goto_8

    :cond_7
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v30

    if-eqz v30, :cond_8

    invoke-interface {v1, v15}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v0, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v31

    new-instance v18, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move/from16 v22, v3

    invoke-direct/range {v18 .. v31}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    move-object/from16 v0, v18

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    move-object/from16 v17, v0

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v17

    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectUserReactionsToMessage$lambda$7(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 31

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v3, 0x2

    move-object/from16 v4, p2

    invoke-interface {v1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "messageId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "userId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "type"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "createdAt"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdLocallyAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deletedAt"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "enforceUnique"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "skipPush"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "emojiCode"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "extraData"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "syncStatus"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move/from16 p2, v3

    move/from16 p4, v4

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v4

    const/16 v16, 0x0

    if-eqz v4, :cond_0

    move-object/from16 v4, v16

    :goto_1
    move/from16 v21, v3

    goto :goto_2

    :cond_0
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_1

    :goto_2
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v22

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v3, v16

    goto :goto_3

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_3
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v3, v16

    goto :goto_4

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_4
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v3, v16

    goto :goto_5

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_5
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_4

    const/16 v26, 0x1

    :goto_6
    move v3, v5

    goto :goto_7

    :cond_4
    const/16 v26, 0x0

    goto :goto_6

    :goto_7
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_5

    const/16 v27, 0x1

    goto :goto_8

    :cond_5
    const/16 v27, 0x0

    :goto_8
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object/from16 v28, v16

    goto :goto_9

    :cond_6
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v28, v4

    :goto_9
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_a
    move-object/from16 v4, v16

    goto :goto_b

    :cond_7
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    goto :goto_a

    :goto_b
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v29

    if-eqz v29, :cond_8

    invoke-interface {v1, v15}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v30

    new-instance v17, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-direct/range {v17 .. v30}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    move-object/from16 v4, v17

    move/from16 v5, p1

    move/from16 p1, v6

    move/from16 v16, v7

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v6, p1

    move/from16 v4, p4

    move/from16 p1, v5

    move/from16 v7, v16

    move v5, v3

    move/from16 v3, p2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_c

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final setDeleteAt$lambda$8(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

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


# virtual methods
.method public final delete(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;I)V

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0xe

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

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;I)V

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

.method public final selectIdsSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionById(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v2, 0xa

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(ILjava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "SELECT * FROM stream_chat_reaction WHERE id IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lig0/h;

    const/16 v3, 0xd

    invoke-direct {v2, v0, p1, p0, v3}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lam2/s;

    const/16 v6, 0x19

    move-object v5, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lig0/h;

    const/16 v2, 0xc

    invoke-direct {v1, p1, p2, p0, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setDeleteAt(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lam2/s;

    const/16 v6, 0x1a

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v3, p3

    invoke-direct/range {v1 .. v6}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

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
